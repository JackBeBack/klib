package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FolderHeart: ImageVector
    get() {
        if (_FolderHeart != null) {
            return _FolderHeart!!
        }
        _FolderHeart = ImageVector.Builder(
            name = "FolderHeart",
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
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.998f, 10.712f)
                curveTo(11.298f, 9.933f, 10.131f, 9.723f, 9.254f, 10.437f)
                curveTo(8.377f, 11.15f, 8.254f, 12.343f, 8.942f, 13.187f)
                curveTo(9.331f, 13.663f, 10.255f, 14.498f, 10.985f, 15.135f)
                curveTo(11.332f, 15.437f, 11.505f, 15.589f, 11.715f, 15.65f)
                curveTo(11.893f, 15.703f, 12.102f, 15.703f, 12.281f, 15.65f)
                curveTo(12.49f, 15.589f, 12.663f, 15.437f, 13.01f, 15.135f)
                curveTo(13.74f, 14.498f, 14.664f, 13.663f, 15.053f, 13.187f)
                curveTo(15.741f, 12.343f, 15.633f, 11.143f, 14.741f, 10.437f)
                curveTo(13.849f, 9.731f, 12.697f, 9.933f, 11.998f, 10.712f)
                close()
            }
        }.build()

        return _FolderHeart!!
    }

@Suppress("ObjectPropertyName")
private var _FolderHeart: ImageVector? = null
