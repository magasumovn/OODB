# oodb
Предметная область - Интернет-магазин. <br/>
Выделено 5 сущностей: Shop, Order, Product, Worker, Customer. <br/>
Классы Worker и Customer наследуются от класса Person. <br/>
В классе Shop хранятся списки сотрудников, покупателей и каталог товаров. <br/>
Покупатель помимо персональных данных имеет список заказов и может оформить заказ с помощью метода createOrder. <br/>
Метод confirmOrder позволяет сотруднику в автоматическом режиме заполнить недостающую информацию о заказе (артикул, цену) <br/>
