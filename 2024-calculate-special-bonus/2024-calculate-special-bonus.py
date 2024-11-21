import pandas as pd

def calculate_special_bonus(df: pd.DataFrame) -> pd.DataFrame:
    df['bonus']=df['salary'].where(
        (df['employee_id']%2==1)&(~df['name'].str.startswith('M')),0
    ).sort_values(ascending=True)
    df=df.sort_values(by=['employee_id','bonus'],ascending=[True,False])
    result=df[['employee_id','bonus']]
    return result
    