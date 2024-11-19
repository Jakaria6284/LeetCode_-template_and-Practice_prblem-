import pandas as pd

def article_views(views: pd.DataFrame) -> pd.DataFrame:
    result=views[views['author_id'] == views['viewer_id']][['author_id']].rename(columns={'author_id':'id'})
    result=result.drop_duplicates(subset=['id']).sort_values(by='id',ascending=True)
    return result
    