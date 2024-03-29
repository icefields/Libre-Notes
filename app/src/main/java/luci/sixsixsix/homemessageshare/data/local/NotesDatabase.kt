package luci.sixsixsix.homemessageshare.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import luci.sixsixsix.homemessageshare.data.local.entities.CollectionEntity
import luci.sixsixsix.homemessageshare.data.local.entities.NoteEntity
import luci.sixsixsix.homemessageshare.data.local.entities.NotesDao

@Database(
    entities = [
        NoteEntity::class,
        CollectionEntity::class
    ], version = 2,

   exportSchema = true
)
// @TypeConverters(Converters::class)
abstract class NotesDatabase: RoomDatabase() {
    abstract val dao: NotesDao
}