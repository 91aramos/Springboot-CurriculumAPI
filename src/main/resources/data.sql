-- Inserciones para la tabla SECTION
INSERT INTO SECTION
            (company,
             dates,
             description,
             responsabilities,
             technologies)
VALUES      ('Allianz Technology (Madrid)',
             '03/2022 - today',
             'TAD Factory EU (Poland/Spain/PT BU) Support of applications: POLA.NET/Globtrotter',
             'Responsibilities:',
             'Technologies:');

INSERT INTO SECTION
            (company,
             dates,
             description,
             responsabilities,
             technologies)
VALUES      ('atSistemas (Madrid)',
             '10/2017 - 03/2022',
             'Santander Bank (SBGM) Consultant for proyects: Everest /HSF/ User Administration/Apolo',
             'Responsibilities:',
             'Technologies:');

INSERT INTO SECTION
            (company,
             dates,
             description,
             responsabilities,
             technologies)
VALUES      ('Interactive Medica (Madrid)',
             '04/2017 - 10/2017',
             '',
             'Responsibilities:',
             'Technologies:');

-- Inserciones para la tabla RESPONSABILITY
INSERT INTO RESPONSABILITY (id_section, text)
VALUES
(1, 'Creation of different sensors and metrics inside the monitoring tools'),
(1, 'Used of CI/CD tools such as Github, Teamcity and Octopus.'),
(1, 'Develop new windows services'),
(1, 'Documentation of incidents and processes in Confluence.'),
(1, 'Analyzing and designing the best solution to implement new requests.'),
(1, 'Ensuring quality and deadlines in the resolution of incidents and requests.'),
(1, 'Technical coordination of the work to be done.'),
(1, 'Creation of tables, views, packages and stored procedures in T-SQL.'),
(1, 'SQL query optimization.'),
(1, 'Data Analysis.'),
(1, 'Testing development.'),
(1, 'Putting into service the development done once approved by the users.'),
(2, 'Development of API REST used by diferent applications within the bank to get the generated data from our applications.'),
(2, 'Development of WindowsForm applications following the MVC pattern.'),
(2, 'Designing, developing, testing, managing and monitoring bugs.'),
(2, 'Analyzing and designing the best solution to implement new requests.'),
(2, 'Ensuring quality and deadlines in the resolution of incidents and requests.'),
(2, 'Technical coordination of the work to be done.'),
(2, 'Creation of tables, views, packages and stored procedures in T-SQL.'),
(2, 'SQL query optimization.'),
(2, 'Data Analysis.'),
(2, 'Testing development.'),
(2, 'Putting into service the development done once approved by the users.'),
(2, 'Proyect manager, working with Agile methodologies. Using Team Fundation Server as a tool to create and manage tasks and tests.'),
(3, 'Designing, developing, testing, managing and monitoring bugs.'),
(3, 'Analyzing and designing the best solution to implement new requests.'),
(3, 'Ensuring quality and deadlines in the resolution of incidents and requests.'),
(3, 'Technical coordination of the work.'),
(3, 'Creation of tables, views, packages and stored procedures in T-SQL.'),
(3, 'Data Analysis.'),
(3, 'Testing the development done.'),
(3, 'Putting into service the development done once approved by the users.'),
(3, 'Configuration and management of the company’s CRM app, pharmacist oriented.'),
(3, 'Configuration and management of automatic tasks for loading and modifying data. (Task Manager Windows)');

-- Inserciones para la tabla TECHNOLOGY
INSERT INTO TECHNOLOGY (id_section, text)
VALUES
(1, 'SQL Server. Relational data model.'),
(1, 'IBM AS400'),
(1, '.NET environment'),
(1, 'Windows Forms Apps, with Visual Basic and C#, ADO .NET and Framework 4.0'),
(1, 'Windows Services, with Visual Basic and C#, IBM DB2 Library, and Framework 4.5'),
(1, 'APIs, with C#, Framework 4.5 and Entity Framework.'),
(1, 'GitHub'),
(1, 'TeamCity'),
(1, 'Octopus'),
(1, 'PRTG Monitor'),
(1, 'Dynatrace'),
(1, 'ElasticSearch'),
(2, 'SQL Server. Relational data model.'),
(2, 'Microsoft Access'),
(2, 'SQLite'),
(2, '.NET Framework 4.0 & 4.5'),
(2, 'Windows Forms Apps'),
(2, 'Visual Basic'),
(2, 'ADO .NET'),
(2, 'APIs'),
(2, 'C#'),
(2, 'Entity Framework'),
(2, 'Dapper'),
(2, 'Team Fundation Server'),
(3, 'SQL Server. Relational data model.'),
(3, 'Packages, procedures and functions T-SQL'),
(3, 'Design and administration of the DB model.');

-- Inserciones para la tabla SKILL
INSERT INTO SKILL (description, score)
VALUES
('C#', '9/10'),
('VB', '9/10'),
('Java', '8/10'),
('C++', '8/10'),
('Angular17', '6/10'),
('HTML', '7.5/10'),
('CSS', '5/10'),
('Spring', '6/10'),
('AWS Cloud Essentials', '7/10'),
('Linux', '7/10'),
('Windows', '8/10'),
('.NET Framework', '9/10'),
('.NET 8', '7.5/10'),
('Windows Forms', '9/10'),
('API Rest', '8/10'),
('SQL/T-SQL/PL-SQL/SQLite/MySQL', '8/10'),
('TFS/Git', '7/10'),
('TeamCity', '6/10'),
('Octopus', '6/10'),
('Dynatrace', '7/10'),
('ELK', '6/10'),
('Kubernetes', '5/10'),
('PRTG Monitor', '7/10'),
('Confluence', '9/10'),
('Jira', '9/10'),
('Trello', '9/10');

INSERT INTO TRAINING (name, location, id_skill) VALUES ('Spring', '<a href="https://spring.academy/courses/spring-framework-essentials">Spring Academy</a>', 1);
INSERT INTO TRAINING (name, location, id_skill) VALUES ('Springboot', '<a href="https://spring.academy/courses/building-a-rest-api-with-spring-boot">Spring Academy</a>', 2);
INSERT INTO TRAINING (name, location, id_skill) VALUES ('Angular Essential', '<a href="https://www.linkedin.com/learning/certificates/4560265c3e01c1f08748e089522b28bc3f8a19be4f7cf1af658227f9d94a9601?u=2108001">LinkedIn Learning</a>', 3);
INSERT INTO TRAINING (name, location, id_skill) VALUES ('Angular Advance', '<a href="https://www.linkedin.com/learning/certificates/0dd3a547d83d4050f45999b152131bfacb33f601a166a2803f5e1e33d2bd873f?u=2108001">LinkedIn Learning</a>', 4);
INSERT INTO TRAINING (name, location, id_skill) VALUES ('Scrum Master Certified (ID: 001574374)', '<a href="https://www.scrumalliance.org/">ScrumAlliance</a>', 4);
  