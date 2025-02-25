package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FolderShield: ImageVector
    get() {
        if (_FolderShield != null) {
            return _FolderShield!!
        }
        _FolderShield = ImageVector.Builder(
            name = "FolderShield",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 8.2f)
                curveTo(3f, 7.08f, 3f, 6.52f, 3.218f, 6.092f)
                curveTo(3.41f, 5.716f, 3.716f, 5.41f, 4.092f, 5.218f)
                curveTo(4.52f, 5f, 5.08f, 5f, 6.2f, 5f)
                horizontalLineTo(9.675f)
                curveTo(10.164f, 5f, 10.408f, 5f, 10.639f, 5.055f)
                curveTo(10.842f, 5.104f, 11.038f, 5.185f, 11.217f, 5.295f)
                curveTo(11.418f, 5.418f, 11.591f, 5.591f, 11.937f, 5.937f)
                lineTo(12.063f, 6.063f)
                curveTo(12.409f, 6.409f, 12.582f, 6.582f, 12.783f, 6.705f)
                curveTo(12.962f, 6.815f, 13.158f, 6.896f, 13.361f, 6.945f)
                curveTo(13.592f, 7f, 13.836f, 7f, 14.325f, 7f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 7f, 19.48f, 7f, 19.908f, 7.218f)
                curveTo(20.284f, 7.41f, 20.59f, 7.716f, 20.782f, 8.092f)
                curveTo(21f, 8.52f, 21f, 9.08f, 21f, 10.2f)
                verticalLineTo(15.8f)
                curveTo(21f, 16.92f, 21f, 17.48f, 20.782f, 17.908f)
                curveTo(20.59f, 18.284f, 20.284f, 18.59f, 19.908f, 18.782f)
                curveTo(19.48f, 19f, 18.92f, 19f, 17.8f, 19f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 19f, 4.52f, 19f, 4.092f, 18.782f)
                curveTo(3.716f, 18.59f, 3.41f, 18.284f, 3.218f, 17.908f)
                curveTo(3f, 17.48f, 3f, 16.92f, 3f, 15.8f)
                verticalLineTo(8.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 11f)
                curveTo(15f, 11f, 14.694f, 11f, 14.625f, 11f)
                curveTo(13.601f, 11f, 12.708f, 10.645f, 12f, 10f)
                curveTo(11.292f, 10.645f, 10.399f, 11f, 9.375f, 11f)
                curveTo(9.306f, 11f, 9f, 11f, 9f, 11f)
                curveTo(9f, 11f, 9f, 11.667f, 9f, 12.055f)
                curveTo(9f, 13.953f, 10.275f, 15.548f, 12f, 16f)
                curveTo(13.725f, 15.548f, 15f, 13.953f, 15f, 12.055f)
                curveTo(15f, 11.667f, 15f, 11f, 15f, 11f)
                close()
            }
        }.build()

        return _FolderShield!!
    }

@Suppress("ObjectPropertyName")
private var _FolderShield: ImageVector? = null
