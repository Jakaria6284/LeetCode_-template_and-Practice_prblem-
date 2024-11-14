import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    # First, create a DataFrame from 'students'
    df = pd.DataFrame(students)
    
    # Then filter the DataFrame where student_id is 101 and select only 'name' and 'age' columns
    df = df.loc[df["student_id"] == 101, ["name", "age"]]
    
    # Return the filtered DataFrame
    return df
