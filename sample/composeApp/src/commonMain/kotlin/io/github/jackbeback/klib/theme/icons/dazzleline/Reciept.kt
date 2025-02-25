package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Reciept: ImageVector
    get() {
        if (_Reciept != null) {
            return _Reciept!!
        }
        _Reciept = ImageVector.Builder(
            name = "Reciept",
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
                moveTo(7f, 13f)
                horizontalLineTo(13f)
                moveTo(7f, 9f)
                horizontalLineTo(9f)
                moveTo(7f, 17f)
                horizontalLineTo(13f)
                moveTo(16f, 21f)
                horizontalLineTo(18.5f)
                moveTo(17f, 21f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 21f, 5.28f, 21f, 4.638f, 20.673f)
                curveTo(4.074f, 20.385f, 3.615f, 19.927f, 3.327f, 19.362f)
                curveTo(3f, 18.72f, 3f, 17.88f, 3f, 16.2f)
                verticalLineTo(5.757f)
                curveTo(3f, 4.852f, 3f, 4.399f, 3.19f, 4.137f)
                curveTo(3.356f, 3.908f, 3.611f, 3.76f, 3.892f, 3.729f)
                curveTo(4.215f, 3.694f, 4.608f, 3.919f, 5.394f, 4.368f)
                lineTo(5.706f, 4.546f)
                curveTo(5.996f, 4.712f, 6.14f, 4.794f, 6.294f, 4.827f)
                curveTo(6.43f, 4.856f, 6.57f, 4.856f, 6.706f, 4.827f)
                curveTo(6.86f, 4.794f, 7.004f, 4.712f, 7.294f, 4.546f)
                lineTo(9.206f, 3.454f)
                curveTo(9.496f, 3.288f, 9.64f, 3.206f, 9.794f, 3.173f)
                curveTo(9.93f, 3.145f, 10.07f, 3.145f, 10.206f, 3.173f)
                curveTo(10.36f, 3.206f, 10.505f, 3.288f, 10.794f, 3.454f)
                lineTo(12.706f, 4.546f)
                curveTo(12.995f, 4.712f, 13.14f, 4.794f, 13.294f, 4.827f)
                curveTo(13.43f, 4.856f, 13.57f, 4.856f, 13.706f, 4.827f)
                curveTo(13.86f, 4.794f, 14.005f, 4.712f, 14.294f, 4.546f)
                lineTo(14.606f, 4.368f)
                curveTo(15.392f, 3.919f, 15.785f, 3.694f, 16.108f, 3.729f)
                curveTo(16.389f, 3.76f, 16.644f, 3.908f, 16.81f, 4.137f)
                curveTo(17f, 4.399f, 17f, 4.852f, 17f, 5.757f)
                verticalLineTo(14f)
                moveTo(17f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                curveTo(21f, 20.105f, 20.105f, 21f, 19f, 21f)
                curveTo(17.895f, 21f, 17f, 20.105f, 17f, 19f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Reciept!!
    }

@Suppress("ObjectPropertyName")
private var _Reciept: ImageVector? = null
