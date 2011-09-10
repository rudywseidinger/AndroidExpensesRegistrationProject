package androidexpensesregistration.domain.dto;

import java.util.ArrayList;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import androidexpensesregistration.domain.model.IGenericRecord;

public interface DTO<T> {
	public ContentValues getContentValues(IGenericRecord iGenericRecord);
	public ArrayList<T> getCursorValues(Cursor cursor, Context context);
}
