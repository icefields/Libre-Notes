/**
 * Copyright (C) 2024  Antonio Tari
 *
 * This file is a part of Libre Notes
 * Android self-hosting, note-taking, client + server application
 * @author Antonio Tari
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package luci.sixsixsix.homemessageshare.domain.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Message(
    val id: String,
    val dateCreated: String,
    val dateModified: String,
    val message: String,
    val title: String,
    val tags: List<String>,
    val custom: Custom? = null
): Parcelable

@Parcelize
class Custom: Parcelable