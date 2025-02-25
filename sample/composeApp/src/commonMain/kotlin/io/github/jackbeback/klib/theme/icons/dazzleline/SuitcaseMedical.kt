package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SuitcaseMedical: ImageVector
    get() {
        if (_SuitcaseMedical != null) {
            return _SuitcaseMedical!!
        }
        _SuitcaseMedical = ImageVector.Builder(
            name = "SuitcaseMedical",
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
                moveTo(16f, 7f)
                verticalLineTo(6.2f)
                curveTo(16f, 5.08f, 16f, 4.52f, 15.782f, 4.092f)
                curveTo(15.59f, 3.716f, 15.284f, 3.41f, 14.908f, 3.218f)
                curveTo(14.48f, 3f, 13.92f, 3f, 12.8f, 3f)
                horizontalLineTo(11.2f)
                curveTo(10.08f, 3f, 9.52f, 3f, 9.092f, 3.218f)
                curveTo(8.716f, 3.41f, 8.41f, 3.716f, 8.218f, 4.092f)
                curveTo(8f, 4.52f, 8f, 5.08f, 8f, 6.2f)
                verticalLineTo(7f)
                moveTo(7f, 7f)
                verticalLineTo(21f)
                moveTo(17f, 7f)
                verticalLineTo(21f)
                moveTo(10f, 14f)
                horizontalLineTo(14f)
                moveTo(12f, 12f)
                verticalLineTo(16f)
                moveTo(7.8f, 21f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 21f, 18.72f, 21f, 19.362f, 20.673f)
                curveTo(19.927f, 20.385f, 20.385f, 19.927f, 20.673f, 19.362f)
                curveTo(21f, 18.72f, 21f, 17.88f, 21f, 16.2f)
                verticalLineTo(11.8f)
                curveTo(21f, 10.12f, 21f, 9.28f, 20.673f, 8.638f)
                curveTo(20.385f, 8.074f, 19.927f, 7.615f, 19.362f, 7.327f)
                curveTo(18.72f, 7f, 17.88f, 7f, 16.2f, 7f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 7f, 5.28f, 7f, 4.638f, 7.327f)
                curveTo(4.074f, 7.615f, 3.615f, 8.074f, 3.327f, 8.638f)
                curveTo(3f, 9.28f, 3f, 10.12f, 3f, 11.8f)
                verticalLineTo(16.2f)
                curveTo(3f, 17.88f, 3f, 18.72f, 3.327f, 19.362f)
                curveTo(3.615f, 19.927f, 4.074f, 20.385f, 4.638f, 20.673f)
                curveTo(5.28f, 21f, 6.12f, 21f, 7.8f, 21f)
                close()
            }
        }.build()

        return _SuitcaseMedical!!
    }

@Suppress("ObjectPropertyName")
private var _SuitcaseMedical: ImageVector? = null
