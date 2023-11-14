drop table if exists expenditures;

drop table if exists payment_types;

drop table if exists expenditure_types;

create table expenditure_types (
    exp_type_id integer not null identity,
    exp_type_name varchar(255) not null,
    exp_type_max_value integer,
    primary key (exp_type_id)
);

create table payment_types (
    payment_type_id integer not null identity,
    payment_type_name varchar(255) not null,
    primary key (payment_type_id)
);

create table expenditures (
    exp_id integer not null identity,
    amount_spent float,
    exp_type_id integer,
    payment_type_id integer,
    created_date date,
    primary key (exp_id)
);


alter table expenditures add constraint FK_exp_type_id foreign key (exp_type_id) references expenditure_types (exp_type_id);

alter table expenditures add constraint FK_payment_type_id foreign key (payment_type_id) references payment_types (payment_type_id);

-- INSERT Statements
insert into payment_types (payment_type_name) VALUES ('Food Wallet');
insert into payment_types (payment_type_name) VALUES ('ICICI Bank');
insert into payment_types (payment_type_name) VALUES ('HDFC Regalia CC');
insert into payment_types (payment_type_name) VALUES ('AMEX CC');
insert into payment_types (payment_type_name) VALUES ('Amazon Pay CC');
insert into payment_types (payment_type_name) VALUES ('ICICI Rubyx CC');
insert into payment_types (payment_type_name) VALUES ('HDFC Savings');

insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Rent', 15000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Maintenance', 3000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Milk', 1500);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Veg + Fruits', 2000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Rice', 1000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Petrol (Bike)', 500);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Petrol (Car)', 5000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('D-Mart', 5000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Electricity Bill', 1500);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Hospital', 18000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Medicines', 2000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Car EMI', 16000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Mutual Funds', 10000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Car/Bike Repairs', 2000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Gold savings', 20000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Cabs', 4000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Outside Food', 5000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Shopping', 5000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Tailor', 1000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Iron', 500);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Trips', 5000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('House Repairs', 1000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Movies', 1000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Gym', NULL);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Fancy Items', NULL);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Saloon', NULL);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Tolls', NULL);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Donations', NULL);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Gas', 1200);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Loans', 45000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Bike Service', 2000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Internet', 5000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('PPF', 150000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('SBI Life Insurance', 50000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Car Service', 5000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('OTT Apps', 8000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('JIO Recharge', 4000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Car Insurance', 20000);
insert into expenditure_types (exp_type_name, exp_type_max_value) values ('Bike Insurance', 10000);