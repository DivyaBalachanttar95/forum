CREATE TABLE questions (
   id INT NOT NULL,
   question text NOT NULL,
   author VARCHAR(20) NOT NULL,
   created_time timestamp,
   updated_time timestamp
);

CREATE TABLE answers (
   id INT NOT NULL,
   answer text NOT NULL,
   author VARCHAR(20) NOT NULL,
   created_time timestamp,
   updated_time timestamp,
   FOREIGN KEY question_id REFERENCES questions(id)
);