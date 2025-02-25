package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MusicNoteDouble: ImageVector
    get() {
        if (_MusicNoteDouble != null) {
            return _MusicNoteDouble!!
        }
        _MusicNoteDouble = ImageVector.Builder(
            name = "MusicNoteDouble",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.451f, 1.228f)
                curveTo(20.728f, 0.863f, 22f, 1.823f, 22f, 3.151f)
                verticalLineTo(16f)
                curveTo(22f, 18.209f, 20.209f, 20f, 18f, 20f)
                curveTo(15.791f, 20f, 14f, 18.209f, 14f, 16f)
                curveTo(14f, 13.791f, 15.791f, 12f, 18f, 12f)
                curveTo(18.729f, 12f, 19.412f, 12.195f, 20f, 12.535f)
                verticalLineTo(7.071f)
                lineTo(10f, 9.929f)
                verticalLineTo(19f)
                curveTo(10f, 21.209f, 8.209f, 23f, 6f, 23f)
                curveTo(3.791f, 23f, 2f, 21.209f, 2f, 19f)
                curveTo(2f, 16.791f, 3.791f, 15f, 6f, 15f)
                curveTo(6.729f, 15f, 7.412f, 15.195f, 8f, 15.535f)
                verticalLineTo(6.009f)
                curveTo(8f, 5.116f, 8.592f, 4.331f, 9.451f, 4.086f)
                lineTo(19.451f, 1.228f)
                close()
                moveTo(18.767f, 3.37f)
                curveTo(19.382f, 3.186f, 20f, 3.646f, 20f, 4.287f)
                curveTo(20f, 4.71f, 19.722f, 5.083f, 19.317f, 5.205f)
                lineTo(11.233f, 7.63f)
                curveTo(10.618f, 7.814f, 10f, 7.354f, 10f, 6.713f)
                curveTo(10f, 6.29f, 10.278f, 5.917f, 10.683f, 5.795f)
                lineTo(18.767f, 3.37f)
                close()
                moveTo(16.017f, 16f)
                curveTo(16.017f, 17.095f, 16.905f, 17.983f, 18f, 17.983f)
                curveTo(19.095f, 17.983f, 19.983f, 17.095f, 19.983f, 16f)
                curveTo(19.983f, 14.905f, 19.095f, 14.017f, 18f, 14.017f)
                curveTo(16.905f, 14.017f, 16.017f, 14.905f, 16.017f, 16f)
                close()
                moveTo(4.017f, 19f)
                curveTo(4.017f, 20.095f, 4.905f, 20.983f, 6f, 20.983f)
                curveTo(7.095f, 20.983f, 7.983f, 20.095f, 7.983f, 19f)
                curveTo(7.983f, 17.905f, 7.095f, 17.017f, 6f, 17.017f)
                curveTo(4.905f, 17.017f, 4.017f, 17.905f, 4.017f, 19f)
                close()
            }
        }.build()

        return _MusicNoteDouble!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteDouble: ImageVector? = null
