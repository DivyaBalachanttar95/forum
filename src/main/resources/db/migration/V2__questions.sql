alter table answers add foreign key (question_id) references questions(question_id);
