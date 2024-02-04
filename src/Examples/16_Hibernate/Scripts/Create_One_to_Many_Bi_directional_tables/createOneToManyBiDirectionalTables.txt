CREATE TABLE developers_relationship.development_team
(
    id         int NOT NULL AUTO_INCREMENT,
    name       varchar(15),
    max_salary int,
    min_salary int,
    PRIMARY KEY (id)
);

CREATE TABLE developers_relationship.developer
(
    id                  int NOT NULL AUTO_INCREMENT,
    name                varchar(15),
    surname             varchar(25),
    salary              int,
    development_team_id int,
    PRIMARY KEY (id),
    FOREIGN KEY (development_team_id) REFERENCES developers_relationship.development_team (id)
);