create type person as (
    person_name varchar(255),
    email varchar(255),
    phone int
    );

create type shop_worker as (
    worker person,
    worker_position varchar(255)
    );

create type customer_order as (
    order_id int,
    product varchar(255),
    quanitity int,
    cost int
    );

create type shop_customer as (
    customer person,
    payment varchar(255),
    customer_order customer_order
    );

create type shop_type as (
    shop_name varchar(255),
    shop_address varchar(255),
    phone int,
    email varchar(255),
    worker shop_worker,
    customer shop_customer
    );

create sequence shop_seq;

create table shops_type
(
    id   int default nextval('shop_seq'),
    shop shop_type,
    constraint shops_type_pk primary key (id)
);

select ((shop).worker).worker_position from shops_type;

insert into shops_type (shop.shop_name,
                        shop.shop_address,
                        shop.phone,
                        shop.email,
                        shop.worker.worker.person_name,
                        shop.worker.worker.email,
                        shop.worker.worker.phone,
                        shop.worker.worker_position,
                        shop.customer.customer.person_name,
                        shop.customer.customer.email,
                        shop.customer.customer.phone,
                        shop.customer.payment,
                        shop.customer.customer_order.order_id,
                        shop.customer.customer_order.product,
                        shop.customer.customer_order.quanitity,
                        shop.customer.customer_order.cost
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
           '7960',
           'Card',
           '1213',
           'Телефон',
           '1',
           '10000'
       );