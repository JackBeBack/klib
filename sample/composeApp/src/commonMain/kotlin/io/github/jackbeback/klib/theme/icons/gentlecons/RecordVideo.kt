package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.RecordVideo: ImageVector
    get() {
        if (_RecordVideo != null) {
            return _RecordVideo!!
        }
        _RecordVideo = ImageVector.Builder(
            name = "RecordVideo",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 18f)
                curveTo(15.314f, 18f, 18f, 15.314f, 18f, 12f)
                curveTo(18f, 8.686f, 15.314f, 6f, 12f, 6f)
                curveTo(8.686f, 6f, 6f, 8.686f, 6f, 12f)
                curveTo(6f, 15.314f, 8.686f, 18f, 12f, 18f)
                close()
                moveTo(12f, 16.01f)
                curveTo(9.785f, 16.01f, 7.99f, 14.215f, 7.99f, 12f)
                curveTo(7.99f, 9.785f, 9.785f, 7.99f, 12f, 7.99f)
                curveTo(14.215f, 7.99f, 16.01f, 9.785f, 16.01f, 12f)
                curveTo(16.01f, 14.215f, 14.215f, 16.01f, 12f, 16.01f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.075f, 23f, 12f)
                curveTo(23f, 5.925f, 18.075f, 1f, 12f, 1f)
                curveTo(5.925f, 1f, 1f, 5.925f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                close()
                moveTo(12f, 20.993f)
                curveTo(7.033f, 20.993f, 3.007f, 16.967f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 16.967f, 16.967f, 20.993f, 12f, 20.993f)
                close()
            }
        }.build()

        return _RecordVideo!!
    }

@Suppress("ObjectPropertyName")
private var _RecordVideo: ImageVector? = null
