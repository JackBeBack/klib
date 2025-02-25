package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Piano: ImageVector
    get() {
        if (_Piano != null) {
            return _Piano!!
        }
        _Piano = ImageVector.Builder(
            name = "Piano",
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
                moveTo(3f, 14f)
                verticalLineTo(9f)
                curveTo(3f, 5.686f, 5.686f, 3f, 9f, 3f)
                horizontalLineTo(9.235f)
                curveTo(12.419f, 3f, 15f, 5.581f, 15f, 8.765f)
                curveTo(15f, 9.447f, 15.553f, 10f, 16.235f, 10f)
                horizontalLineTo(18f)
                curveTo(19.657f, 10f, 21f, 11.343f, 21f, 13f)
                verticalLineTo(16.2f)
                curveTo(21f, 17.88f, 21f, 18.72f, 20.673f, 19.362f)
                curveTo(20.385f, 19.927f, 19.927f, 20.385f, 19.362f, 20.673f)
                curveTo(18.72f, 21f, 17.88f, 21f, 16.2f, 21f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 21f, 5.28f, 21f, 4.638f, 20.673f)
                curveTo(4.074f, 20.385f, 3.615f, 19.927f, 3.327f, 19.362f)
                curveTo(3f, 18.72f, 3f, 17.88f, 3f, 16.2f)
                verticalLineTo(14f)
                close()
                moveTo(3f, 14f)
                horizontalLineTo(21f)
                moveTo(7f, 14f)
                verticalLineTo(17f)
                moveTo(10f, 14f)
                verticalLineTo(17f)
                moveTo(13f, 14f)
                verticalLineTo(17f)
                moveTo(17f, 14f)
                verticalLineTo(17f)
            }
        }.build()

        return _Piano!!
    }

@Suppress("ObjectPropertyName")
private var _Piano: ImageVector? = null
