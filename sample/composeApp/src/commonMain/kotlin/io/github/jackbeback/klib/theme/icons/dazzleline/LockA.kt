package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LockA: ImageVector
    get() {
        if (_LockA != null) {
            return _LockA!!
        }
        _LockA = ImageVector.Builder(
            name = "LockA",
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
                moveTo(7f, 10.074f)
                curveTo(7.471f, 10.045f, 8.053f, 10f, 8.8f, 10f)
                horizontalLineTo(15.2f)
                curveTo(15.947f, 10f, 16.529f, 10.045f, 17f, 10.074f)
                moveTo(7f, 10.074f)
                curveTo(6.412f, 10.11f, 5.994f, 10.19f, 5.638f, 10.372f)
                curveTo(5.074f, 10.66f, 4.615f, 11.118f, 4.327f, 11.683f)
                curveTo(4f, 12.325f, 4f, 13.165f, 4f, 14.845f)
                verticalLineTo(16.245f)
                curveTo(4f, 17.925f, 4f, 18.765f, 4.327f, 19.407f)
                curveTo(4.615f, 19.971f, 5.074f, 20.43f, 5.638f, 20.718f)
                curveTo(6.28f, 21.045f, 7.12f, 21.045f, 8.8f, 21.045f)
                horizontalLineTo(15.2f)
                curveTo(16.88f, 21.045f, 17.72f, 21.045f, 18.362f, 20.718f)
                curveTo(18.927f, 20.43f, 19.385f, 19.971f, 19.673f, 19.407f)
                curveTo(20f, 18.765f, 20f, 17.925f, 20f, 16.245f)
                verticalLineTo(14.845f)
                curveTo(20f, 13.165f, 20f, 12.325f, 19.673f, 11.683f)
                curveTo(19.385f, 11.118f, 18.927f, 10.66f, 18.362f, 10.372f)
                curveTo(18.006f, 10.19f, 17.588f, 10.11f, 17f, 10.074f)
                moveTo(7f, 10.074f)
                verticalLineTo(8.045f)
                curveTo(7f, 5.284f, 9.239f, 3.045f, 12f, 3.045f)
                curveTo(14.761f, 3.045f, 17f, 5.284f, 17f, 8.045f)
                verticalLineTo(10.074f)
                moveTo(10f, 18f)
                lineTo(10.286f, 17f)
                moveTo(14f, 18f)
                lineTo(13.714f, 17f)
                moveTo(10.286f, 17f)
                lineTo(10.831f, 15.092f)
                curveTo(11.18f, 13.87f, 11.354f, 13.259f, 11.624f, 13.106f)
                curveTo(11.857f, 12.973f, 12.143f, 12.973f, 12.376f, 13.106f)
                curveTo(12.646f, 13.259f, 12.82f, 13.87f, 13.169f, 15.092f)
                lineTo(13.714f, 17f)
                moveTo(10.286f, 17f)
                horizontalLineTo(13.714f)
            }
        }.build()

        return _LockA!!
    }

@Suppress("ObjectPropertyName")
private var _LockA: ImageVector? = null
