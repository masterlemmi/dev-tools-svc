INSERT INTO APPLICATION (ID, NAME, URL) VALUES ('1', 'Eclipse', '');
INSERT INTO APPLICATION (ID, NAME, URL) VALUES ('2', 'IntelliJ', '');
INSERT INTO APPLICATION (ID, NAME, URL) VALUES ('3', 'VsCode', '');
INSERT INTO APPLICATION (ID, NAME, URL) VALUES ('4', 'Sublime', '');

INSERT INTO PLUGIN (id, app_id, name, link) VALUES (1, 2,'BashSupport','https://plugins.jetbrains.com/plugin/4230-bashsupport');
INSERT INTO PLUGIN (id, app_id, name, link) VALUES (2, 2,'Scala','https://plugins.jetbrains.com/plugin/1347-scala');
INSERT INTO PLUGIN (id, app_id, name, link) VALUES (3, 1, 'SonarLint','https://www.sonarlint.org/eclipse/');
INSERT INTO PLUGIN (id, app_id, name, link) VALUES (4, 1, 'ECD','https://marketplace.eclipse.org/content/enhanced-class-decompiler');
INSERT INTO PLUGIN (id, app_id, name, link) VALUES (5, 2,'Lombok','https://plugins.jetbrains.com/plugin/6317-lombok-plugin');
