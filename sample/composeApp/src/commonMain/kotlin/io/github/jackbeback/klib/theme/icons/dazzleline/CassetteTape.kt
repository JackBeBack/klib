package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CassetteTape: ImageVector
    get() {
        if (_CassetteTape != null) {
            return _CassetteTape!!
        }
        _CassetteTape = ImageVector.Builder(
            name = "CassetteTape",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f
            ) {
                moveTo(7f, 19f)
                lineTo(7.394f, 17.424f)
                curveTo(7.611f, 16.557f, 7.719f, 16.124f, 7.961f, 15.801f)
                curveTo(8.174f, 15.517f, 8.459f, 15.294f, 8.787f, 15.156f)
                curveTo(9.158f, 15f, 9.605f, 15f, 10.498f, 15f)
                horizontalLineTo(13.502f)
                curveTo(14.395f, 15f, 14.842f, 15f, 15.213f, 15.156f)
                curveTo(15.541f, 15.294f, 15.826f, 15.517f, 16.039f, 15.801f)
                curveTo(16.281f, 16.124f, 16.389f, 16.557f, 16.606f, 17.424f)
                lineTo(17f, 19f)
                moveTo(8f, 12f)
                curveTo(9.105f, 12f, 10f, 11.105f, 10f, 10f)
                curveTo(10f, 8.895f, 9.105f, 8f, 8f, 8f)
                moveTo(8f, 12f)
                curveTo(6.895f, 12f, 6f, 11.105f, 6f, 10f)
                curveTo(6f, 8.895f, 6.895f, 8f, 8f, 8f)
                moveTo(8f, 12f)
                horizontalLineTo(16f)
                moveTo(8f, 8f)
                horizontalLineTo(16f)
                moveTo(16f, 12f)
                curveTo(17.105f, 12f, 18f, 11.105f, 18f, 10f)
                curveTo(18f, 8.895f, 17.105f, 8f, 16f, 8f)
                moveTo(16f, 12f)
                curveTo(14.895f, 12f, 14f, 11.105f, 14f, 10f)
                curveTo(14f, 8.895f, 14.895f, 8f, 16f, 8f)
                moveTo(6.2f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(21f, 7.08f, 21f, 6.52f, 20.782f, 6.092f)
                curveTo(20.59f, 5.716f, 20.284f, 5.41f, 19.908f, 5.218f)
                curveTo(19.48f, 5f, 18.92f, 5f, 17.8f, 5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 5f, 4.52f, 5f, 4.092f, 5.218f)
                curveTo(3.716f, 5.41f, 3.41f, 5.716f, 3.218f, 6.092f)
                curveTo(3f, 6.52f, 3f, 7.08f, 3f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(3f, 16.92f, 3f, 17.48f, 3.218f, 17.908f)
                curveTo(3.41f, 18.284f, 3.716f, 18.59f, 4.092f, 18.782f)
                curveTo(4.52f, 19f, 5.08f, 19f, 6.2f, 19f)
                close()
            }
        }.build()

        return _CassetteTape!!
    }

@Suppress("ObjectPropertyName")
private var _CassetteTape: ImageVector? = null
