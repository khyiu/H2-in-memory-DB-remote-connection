CREATE TABLE "PUBLIC"."USR"
(
   ID bigint PRIMARY KEY NOT NULL,
   EMAIL varchar(255),
   USERNAME varchar(255),
   PASSWORD varchar(8)
)
;

INSERT INTO "PUBLIC"."USR" (ID, EMAIL, USERNAME, PASSWORD)
VALUES (1, 'test@test.com', 'test1', 'pass1234');

INSERT INTO "PUBLIC"."USR" (ID, EMAIL, USERNAME, PASSWORD)
VALUES (2, 'test@gamil.com', 'test2', 'pass4321');