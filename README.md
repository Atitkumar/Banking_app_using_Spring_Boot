Basic Banking application using SpringBoot 3.
tomcat url - http://localhost:8182/api/accounts
-----------------------------------------------------------------------------------------
Add account.
POST - http://localhost:8182/api/accounts
{
    "accountHolderName":"Atit",
    "balance":12321

}
-----------------------------------------------------------------------------------------
Get account details by id.
GET - http://localhost:8182/api/accounts/2

-----------------------------------------------------------------------------------------
Deposit Money to account.
POST - http://localhost:8182/api/accounts/2/deposit 
{
    "amount":1114
}

-----------------------------------------------------------------------------------------
Withdraw Money -
PUT - http://localhost:8182/api/accounts/2/withdraw
{
    "amount":2314
}

-----------------------------------------------------------------------------------------
Get all account details -
GET - http://localhost:8182/api/accounts
[
    {
        "id": 1,
        "accountHolderName": "Atit",
        "balance": 27314.0
    },
    {
        "id": 3,
        "accountHolderName": "Anish",
        "balance": 32524.0
    },
    {
        "id": 4,
        "accountHolderName": "Tanishq",
        "balance": 12321.0
    }
]

-----------------------------------------------------------------------------------------
Delete account by ID 
DELETE - http://localhost:8182/api/accounts/2
Account deleted successfully!
