package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.RecordVideoStop: ImageVector
    get() {
        if (_RecordVideoStop != null) {
            return _RecordVideoStop!!
        }
        _RecordVideoStop = ImageVector.Builder(
            name = "RecordVideoStop",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 7f)
                curveTo(15.657f, 7f, 17f, 8.343f, 17f, 10f)
                verticalLineTo(14f)
                curveTo(17f, 15.657f, 15.657f, 17f, 14f, 17f)
                horizontalLineTo(10f)
                curveTo(8.343f, 17f, 7f, 15.657f, 7f, 14f)
                verticalLineTo(10f)
                curveTo(7f, 8.343f, 8.343f, 7f, 10f, 7f)
                horizontalLineTo(14f)
                close()
                moveTo(14f, 9f)
                curveTo(14.552f, 9f, 15f, 9.448f, 15f, 10f)
                verticalLineTo(14f)
                curveTo(15f, 14.552f, 14.552f, 15f, 14f, 15f)
                horizontalLineTo(10f)
                curveTo(9.448f, 15f, 9f, 14.552f, 9f, 14f)
                verticalLineTo(10f)
                curveTo(9f, 9.448f, 9.448f, 9f, 10f, 9f)
                horizontalLineTo(14f)
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

        return _RecordVideoStop!!
    }

@Suppress("ObjectPropertyName")
private var _RecordVideoStop: ImageVector? = null
