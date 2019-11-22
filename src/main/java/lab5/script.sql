create type person as (
    personname varchar(255),
    email varchar(255),
    phone int8
    );

create type shop_worker as (
    worker person,
    worker_position varchar(255)
    );

create type shop_customer as (
    customer person,
    payment varchar(255),
    order shop_order
    );

create type shop_order as (
    id int8,
    product varchar(255)
    quanitity int2,
    cost double
    );

create type shop_type as (
    shop_name varchar(255),
    shop_address varchar(255),
    phone int8,
    email varchar(255),
    worker shop_worker,
    customer shop_customer
    );

create sequence shop_seq;

insert into shops_type (shop.shop_name,
                        shop.shop_address,
                        shop.phone,
                        shop.email,
                        shop.worker.worker.personname,
                        shop.worker.worker.email,
                        shop.worker.worker.phone,
                        shop.worker.worker_position,
                        shop.customer.customer.personname,
                        shop.customer.customer.email,
                        shop.customer.customer.payment,
                        shop.customer.order.id,
                        shop.customer.order.product,
                        shop.customer.order.quanitity,
                        shop.customer.order.cost
                        )
values (
           'Магнит',
           'Баумана',
           '432750',
           'shop@gmail.com',
           'Никита',
           'worker@gmail.com',
           '79603',
           'manager',
           'Арсений',
           'customer@gmail.com',
           'Card',
           '1213',
           'Телефон',
           '1',
           '10000'
       );

create table shops_type
(
    id   bigint default nextval('shop_seq'),
    shop shop_type,
    constraint shops_type_pk primary key (id)
);

select ((shop).worker).code from shops_type;
