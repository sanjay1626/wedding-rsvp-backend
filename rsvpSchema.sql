create schema if not exists wedding_rsvp;
use wedding_rsvp;
create table if not exists event (
    event_id int not null auto_increment primary key,
    guest_name varchar(50) not null,
	guest_email varchar(50) not null,
    totalAttending int not null,
    description varchar(50) not null
);
create table if not exists guest (
    guest_id int not null auto_increment primary key,
    event_id int not null,
    name varchar(50) not null,
    email varchar(50) not null,
    attending BOOLEAN not null
);

describe event;
describe guest;


select * from event;
select * from guest;

/* Foreign Keys */
alter table guest add constraint fk_guest_event foreign key (event_id) references event(event_id);

/*Drop Foregin Keys */
ALTER TABLE event DROP FOREIGN KEY fk_event_guest;