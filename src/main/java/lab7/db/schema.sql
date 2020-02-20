create table shop
(
    id       serial      not null,
    shopname varchar(60) not null,
    address  varchar(60) not null,
    phone    bigint      not null,
    email    varchar(20),
    primary key (id)
);

create table customer
(
    id                    serial      not null,
    personname            varchar(50) not null,
    phone                 varchar(20),
    email                 varchar(20),
    payment               varchar(50) not null,
    primary key (id)
);

create table customersorder
(
    id          serial      not null,
    product     varchar(50) not null,
    quantity    bigint      not null,
    cost        bigint      not null,
    customer_id bigint      not null,
    primary key (id),
    foreign key (customer_id) references customer (id) on delete cascade
);

create table worker
(
    id           serial      not null,
    personname   varchar(50) not null,
    phone        varchar(20),
    email        varchar(20),
    position     varchar(20) not null,
    shop_id      bigint      not null,
    primary key (id),
    foreign key (shop_id) references shop (id) on delete cascade
);