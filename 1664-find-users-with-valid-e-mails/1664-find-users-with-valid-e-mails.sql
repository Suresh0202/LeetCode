# Write your MySQL query statement below
select user_id,name,mail
from Users
-- where (mail like '%@leetcode.com') and ((mail like '%.' )or (mail like '%-') or (mail like '%_')) and (mail not like '.%' or mail not like '%#%')
where mail
REGEXP '^[a-zA-Z][A-Za-z0-9_.-]*@leetcode\\.com$'

-- mail='%.' or mail = '%_' or mail ='%-') or