import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    # Perform a left join between customers and orders on the specified columns
    merged = pd.merge(customers, orders, left_on='id', right_on='customerId', how='left')
    
    # Filter rows where 'customerId' is NaN (customers with no orders)
    filtered = merged[merged['customerId'].isna()][['name']].rename(columns={'name':'Customers'})
    
    # Select only the 'name' column
   # result = filtered[['name']]
    
    return filtered
