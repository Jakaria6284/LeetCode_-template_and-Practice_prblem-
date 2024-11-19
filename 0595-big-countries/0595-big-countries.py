import pandas as pd

def big_countries(world: pd.DataFrame) -> pd.DataFrame:
    df=pd.DataFrame(world)
    filtered=df[(df['area']>=3000000) | (df['population']>=25000000)]

    return filtered[['name','population','area']]
    