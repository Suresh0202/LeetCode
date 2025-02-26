# Write your MySQL query statement below
select (customer_number) as customer_number
from Orders
group by customer_number
order by customer_number desc
limit 1
