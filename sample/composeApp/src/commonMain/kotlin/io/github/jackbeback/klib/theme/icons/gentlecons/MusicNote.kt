package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MusicNote: ImageVector
    get() {
        if (_MusicNote != null) {
            return _MusicNote!!
        }
        _MusicNote = ImageVector.Builder(
            name = "MusicNote",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.515f, 1.121f)
                curveTo(19.777f, 0.806f, 21f, 1.76f, 21f, 3.062f)
                verticalLineTo(5.938f)
                curveTo(21f, 6.856f, 20.375f, 7.656f, 19.485f, 7.879f)
                lineTo(13f, 9.5f)
                verticalLineTo(18f)
                curveTo(13f, 20.761f, 10.761f, 23f, 8f, 23f)
                curveTo(5.239f, 23f, 3f, 20.761f, 3f, 18f)
                curveTo(3f, 15.239f, 5.239f, 13f, 8f, 13f)
                curveTo(9.126f, 13f, 10.164f, 13.372f, 11f, 14f)
                verticalLineTo(4.562f)
                curveTo(11f, 3.644f, 11.625f, 2.844f, 12.515f, 2.621f)
                lineTo(18.515f, 1.121f)
                close()
                moveTo(17.757f, 3.311f)
                curveTo(18.389f, 3.153f, 19f, 3.63f, 19f, 4.281f)
                verticalLineTo(5.219f)
                curveTo(19f, 5.678f, 18.688f, 6.078f, 18.243f, 6.189f)
                lineTo(14.243f, 7.189f)
                curveTo(13.611f, 7.347f, 13f, 6.87f, 13f, 6.219f)
                verticalLineTo(5.281f)
                curveTo(13f, 4.822f, 13.312f, 4.422f, 13.757f, 4.311f)
                lineTo(17.757f, 3.311f)
                close()
                moveTo(5.008f, 18f)
                curveTo(5.008f, 19.653f, 6.347f, 20.992f, 8f, 20.992f)
                curveTo(9.653f, 20.992f, 10.992f, 19.653f, 10.992f, 18f)
                curveTo(10.992f, 16.347f, 9.653f, 15.008f, 8f, 15.008f)
                curveTo(6.347f, 15.008f, 5.008f, 16.347f, 5.008f, 18f)
                close()
            }
        }.build()

        return _MusicNote!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNote: ImageVector? = null
