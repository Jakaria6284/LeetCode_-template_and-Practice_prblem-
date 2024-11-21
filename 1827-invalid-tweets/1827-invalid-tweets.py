import pandas as pd

def invalid_tweets(df: pd.DataFrame) -> pd.DataFrame:
    result=df[df['content'].str.len()>15][['tweet_id']]
    return result
    