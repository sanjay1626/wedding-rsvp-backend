create schema if not exists wedding_rsvp;
use wedding_rsvp;
create table if not exists event (
    event_id int not null auto_increment primary key,
    location varchar(50) not null,
    eventName varchar(255) not null
);
create table if not exists guest (
    guest_id int not null auto_increment primary key,
    guest_event_id int not null,
    guestName varchar(50) not null,
    guestEmail varchar(50) not null,
    totalInvited VARCHAR(50) not null,
    attending BOOLEAN not null
);

/* Foreign Keys */
alter table event add constraint fk_event_guest foreign key (event_id) references guest(event_id);

/*Drop Foregin Keys */
ALTER TABLE guest DROP FOREIGN KEY fk_guest_event;