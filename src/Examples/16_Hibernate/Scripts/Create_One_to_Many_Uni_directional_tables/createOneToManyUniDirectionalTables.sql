CREATE TABLE prostitution.bardel
(
    id         int NOT NULL AUTO_INCREMENT,
    name       varchar(45),
    max_salary int,
    min_salary int,
    PRIMARY KEY (id)
);

CREATE TABLE prostitution.whores
(
    id                  int NOT NULL AUTO_INCREMENT,
    name                varchar(45),
    surname             varchar(45),
    salary              int,
    bardel_id int,
    PRIMARY KEY (id),
    FOREIGN KEY (bardel_id) REFERENCES prostitution.bardel (id)
);