CREATE TABLE relationships_between_players_and_their_statistics.details
(
    id             int NOT NULL AUTO_INCREMENT,
    game_name      varchar(45),
    publisher      varchar(45),
    is_multiplayer boolean,
    is_ranked      boolean,
    is_eSport      boolean,
    PRIMARY KEY (id)
);

CREATE TABLE relationships_between_players_and_their_statistics.player
(
    id            int NOT NULL AUTO_INCREMENT,
    nickname      varchar(45),
    platform      varchar(45),
    hours_in_game int,
    details_id    int,
    PRIMARY KEY (id),
    FOREIGN KEY (details_id) REFERENCES relationships_between_players_and_their_statistics.details (id)
);