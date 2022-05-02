DROP TABLE IF EXISTS comment CASCADE;
DROP TABLE IF EXISTS post CASCADE;
DROP TABLE IF EXISTS game_topic CASCADE;

CREATE TABLE game_topic
(
    "id"   int PRIMARY KEY,
    "name" varchar
);

CREATE TABLE post
(
    "id" SERIAL PRIMARY KEY,
    "title" varchar,
    "author"  varchar,
    "content" varchar,
    "id_gametopic" int
);

CREATE TABLE comment
(
    "id"      SERIAL PRIMARY KEY,
    "author"  varchar,
    "content" varchar,
    "id_post" int
);


ALTER TABLE comment ADD FOREIGN KEY ("id_post") REFERENCES post ("id");
ALTER TABLE post ADD FOREIGN KEY ("id_gametopic") REFERENCES game_topic ("id");