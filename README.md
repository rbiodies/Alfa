# Alfa
## [Task number 4.](https://github.com/rbiodies/Alfa/tree/main/4_sql_expressions)
The banking system contains the main account table, which stores the accounts of all bank customers:

CREATE TABLE account (

id CHAR NOT NULL, -- account ID

client_id CHAR NOT NULL, -- identifier of the client, account holder

created DATE, -- account opening date

closed DATE, -- account closing date

amount BIGINT, -- account balance

PRIMARY KEY(id)

)

It is necessary to write SQL expressions for queries that return:
- list of open client accounts client_id=<client number\> today
- list of clients who have closed all their accounts
- list of the most "valuable" clients for the bank, explaining how you define the "value" of a client
## [Task number 5.](https://github.com/rbiodies/Alfa/tree/main/5_queue)
Given two ordered queues that may contain the same elements. Combine (Java) these queues into one ordered queue, eliminating duplicate elements.
## [Task number 6.](https://github.com/rbiodies/Alfa/tree/main/6_symmetric_difference)
Implement (Java) symmetric difference of two collections using Collection methods (addAll(), removeAll(), retainAll()).
