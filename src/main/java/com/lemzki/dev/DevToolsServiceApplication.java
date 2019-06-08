package com.lemzki.dev;

import com.lemzki.common.reader.CsvData;
import com.lemzki.common.reader.ResourceReader;
import com.lemzki.dev.application.Application;
import com.lemzki.dev.application.ApplicationRepository;
import com.lemzki.dev.application.ApplicationService;
import com.lemzki.dev.shortcut.Shortcut;
import com.lemzki.dev.shortcut.ShortcutRepository;
import com.lemzki.dev.shortcut.ShortcutService;
import com.lemzki.dev.shortcut.action.Action;
import com.lemzki.dev.shortcut.action.ActionRepository;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lemzki"})
public class DevToolsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevToolsServiceApplication.class, args);
	}

	@Autowired
	ResourceReader<CsvData> reader;

	@Bean
	ApplicationRunner init(ShortcutRepository shortcutRepository, ApplicationRepository appRepo, ActionRepository actionRepository){
		return args-> {
			CsvData shortcuts = reader.read("shortcut.csv");
			List<CSVRecord> rows = shortcuts.getRecords();

			Application intellijApp = appRepo.findByName("IntelliJ");
			Application eclipseApp = appRepo.findByName("Eclipse");
			Application vscodeApp = appRepo.findByName("VsCode");

			rows.forEach(row -> {
				String eclipseShortcut = row.get(1);
				String intellij = row.get(2);
				String vscode = row.get(3);
				String actionDesc = row.get(4);

				Action action = new Action();
				action.setAction(actionDesc);


				Shortcut shortcut = new Shortcut();
				shortcut.setAction(action);
				shortcut.setShortcutKey(eclipseShortcut);
				shortcut.setApp(eclipseApp);


				Shortcut shortcut2 = new Shortcut();
				shortcut2.setAction(action);
				shortcut2.setShortcutKey(intellij);
				shortcut2.setApp(intellijApp);

				Shortcut shortcut3 = new Shortcut();
				shortcut3.setAction(action);
				shortcut3.setShortcutKey(vscode);
				shortcut3.setApp(vscodeApp);

				action.addShortcut(shortcut);
				action.addShortcut(shortcut2);
				action.addShortcut(shortcut3);
				actionRepository.save(action);


				shortcutRepository.save(shortcut);
				shortcutRepository.save(shortcut2);
				shortcutRepository.save(shortcut3);


			});


			String[] apps = {"IntelliJ", "VsCode", "Eclipse"};
			Arrays.stream(apps)
					.forEach(header -> {
						Application application = appRepo.findByName(header);

						shortcuts.getRecords()
								.forEach(row -> {

									if (application == null) return;

									String key = row.get(header);
									String action = row.get("action");

								});


					});
		};

	}


}