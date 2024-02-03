CREATE TABLE relationship_between_a_weapon_and_its_characteristics.characteristics
(
    id      int NOT NULL AUTO_INCREMENT,
    type    varchar(45),
    country varchar(45),
    PRIMARY KEY (id)
);

CREATE TABLE relationship_between_a_weapon_and_its_characteristics.weapon
(
    id                 int NOT NULL AUTO_INCREMENT,
    name               varchar(45),
    characteristics_id int,
    PRIMARY KEY (id),
    FOREIGN KEY (characteristics_id) REFERENCES relationship_between_a_weapon_and_its_characteristics.characteristics (id)
);