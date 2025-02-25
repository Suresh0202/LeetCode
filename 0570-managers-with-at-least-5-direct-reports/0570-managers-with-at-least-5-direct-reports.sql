# Write your MySQL query statement below
select e.name
from Employee e
join Employee d on e.id = d.managerId
group by d.managerId
having count(d.managerId) >= 5