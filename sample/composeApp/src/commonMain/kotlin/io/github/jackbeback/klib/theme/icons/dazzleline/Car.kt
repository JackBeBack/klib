package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Car: ImageVector
    get() {
        if (_Car != null) {
            return _Car!!
        }
        _Car = ImageVector.Builder(
            name = "Car",
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
                moveTo(3f, 8f)
                lineTo(5.722f, 10.268f)
                curveTo(5.902f, 10.418f, 6.128f, 10.5f, 6.362f, 10.5f)
                horizontalLineTo(17.638f)
                curveTo(17.872f, 10.5f, 18.098f, 10.418f, 18.278f, 10.268f)
                lineTo(21f, 8f)
                moveTo(6.5f, 14f)
                horizontalLineTo(6.51f)
                moveTo(17.5f, 14f)
                horizontalLineTo(17.51f)
                moveTo(8.161f, 4.5f)
                horizontalLineTo(15.839f)
                curveTo(16.557f, 4.5f, 17.22f, 4.885f, 17.576f, 5.508f)
                lineTo(20.473f, 10.578f)
                curveTo(20.818f, 11.182f, 21f, 11.866f, 21f, 12.562f)
                verticalLineTo(18.5f)
                curveTo(21f, 19.052f, 20.552f, 19.5f, 20f, 19.5f)
                horizontalLineTo(19f)
                curveTo(18.448f, 19.5f, 18f, 19.052f, 18f, 18.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(6f)
                verticalLineTo(18.5f)
                curveTo(6f, 19.052f, 5.552f, 19.5f, 5f, 19.5f)
                horizontalLineTo(4f)
                curveTo(3.448f, 19.5f, 3f, 19.052f, 3f, 18.5f)
                verticalLineTo(12.562f)
                curveTo(3f, 11.866f, 3.182f, 11.182f, 3.527f, 10.578f)
                lineTo(6.424f, 5.508f)
                curveTo(6.78f, 4.885f, 7.443f, 4.5f, 8.161f, 4.5f)
                close()
                moveTo(7f, 14f)
                curveTo(7f, 14.276f, 6.776f, 14.5f, 6.5f, 14.5f)
                curveTo(6.224f, 14.5f, 6f, 14.276f, 6f, 14f)
                curveTo(6f, 13.724f, 6.224f, 13.5f, 6.5f, 13.5f)
                curveTo(6.776f, 13.5f, 7f, 13.724f, 7f, 14f)
                close()
                moveTo(18f, 14f)
                curveTo(18f, 14.276f, 17.776f, 14.5f, 17.5f, 14.5f)
                curveTo(17.224f, 14.5f, 17f, 14.276f, 17f, 14f)
                curveTo(17f, 13.724f, 17.224f, 13.5f, 17.5f, 13.5f)
                curveTo(17.776f, 13.5f, 18f, 13.724f, 18f, 14f)
                close()
            }
        }.build()

        return _Car!!
    }

@Suppress("ObjectPropertyName")
private var _Car: ImageVector? = null
