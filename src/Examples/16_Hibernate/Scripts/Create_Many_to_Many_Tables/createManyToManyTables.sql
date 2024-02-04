CREATE TABLE many_to_many.children
(
    id   int NOT NULL AUTO_INCREMENT,
    name varchar(45),
    age  int,
    PRIMARY KEY (id)
);

CREATE TABLE many_to_many.section
(
    id   int NOT NULL AUTO_INCREMENT,
    name varchar(45),
    PRIMARY KEY (id)
);

CREATE TABLE many_to_many.child_section
(
    child_id   int NOT NULL,
    section_id int NOT NULL,
    PRIMARY KEY (child_id, section_id),
    FOREIGN KEY (child_id) REFERENCES many_to_many.children (id),
    FOREIGN KEY (section_id) REFERENCES many_to_many.section (id)
);