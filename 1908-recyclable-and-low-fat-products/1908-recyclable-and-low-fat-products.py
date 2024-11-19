import pandas as pd

def find_products(products: pd.DataFrame) -> pd.DataFrame:
    # Filter the DataFrame for conditions
    filtered = products[(products['low_fats'] == 'Y') & (products['recyclable'] == 'Y')]
    
    # Drop unnecessary columns
    ans = filtered.drop(['low_fats', 'recyclable'], axis=1)
    
    return ans
