# Write your MySQL query statement below
select  p.product_id,p.product_name
from Product p
join  Sales s on p.product_id = s.product_id
group by product_id
having MIN(s.sale_date)>='2019-01-01'and MAX(s.sale_date)<='2019-03-31'