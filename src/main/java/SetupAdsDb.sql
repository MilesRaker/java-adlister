USE adlister_db;

CREATE TABLE IF NOT EXISTS ads(
    id int UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id int UNSIGNED,
    title varchar(50),
    description varchar(255)
);

CREATE TABLE IF NOT EXISTS users(
    id int UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username varchar(50),
    email varchar(50),
    password varchar(50)
);

INSERT INTO users(username, email, password)
VALUES
    ('mraker', 'milesraker@gmail.com', 'password'),
    ('praker', 'princesspenny@gmail.com', 'password'),
    ('jraker', 'joandafluff@gmail.com', 'password');

INSERT INTO ads(id, user_id, title, description)
VALUES
    (1, 1, 'Custom Website', 'Miles co will make super fancy websites for you for commission.'),
    (2,1,'Three Legged Stool', 'Stools are better with three legs'),
    (3, 2, 'Used Mouse', 'well loved felt mouse, heavily drenched in catnip'),
    (4, 3, 'Cat Hair', 'I shed a ton, and I\'m sharing the fluff!');