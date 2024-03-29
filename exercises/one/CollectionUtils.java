import java.util.Collection;

public class CollectionUtils
{
	public static int cardinality(Object obj, Collection coll)
	{
		int objOccurrence = 0;
		
		if (obj != null)
		{
			for (Object object : coll)
			{
				if (object.equals(obj))
				{
					objOccurrence++;
				}
			}
		}
		
		return objOccurrence; 
	}
}
