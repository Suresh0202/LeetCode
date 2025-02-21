select max(salary) as SecondhighestSalary from Employee
where (salary) < (
select max(salary) from Employee)


-- select max(salary) from Employee