CREATE TABLE questions (
   question_id  INT NOT NULL PRIMARY KEY,
   question text NOT NULL,
   author VARCHAR(20) NOT NULL,
   created_time timestamp,
   updated_time timestamp
);

CREATE TABLE answers (
   answer_id  INT NOT NULL PRIMARY KEY,
   answer text NOT NULL,
   author VARCHAR(20) NOT NULL,
   created_time timestamp,
   updated_time timestamp,
   question_id int not null
);

