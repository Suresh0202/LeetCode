# Write your MySQL query statement below
select p.product_name,sum(o.unit) as unit
from Products p
inner join Orders o on p.product_id = o.product_id
where date(o.order_date)  >= '2020-02-01' and date(o.order_date)  <='2020-02-29'
group by p.product_id
having sum(o.unit)>=100 


--  and (o.order_date >= '2020-02-01' and o.order_date <='2020-02-28';