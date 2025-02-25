package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) {
            return _Briefcase!!
        }
        _Briefcase = ImageVector.Builder(
            name = "Briefcase",
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
                moveTo(3.027f, 10.022f)
                lineTo(6.685f, 12.948f)
                curveTo(7.173f, 13.338f, 7.416f, 13.533f, 7.687f, 13.672f)
                curveTo(7.928f, 13.795f, 8.184f, 13.884f, 8.449f, 13.939f)
                curveTo(8.748f, 14f, 9.06f, 14f, 9.684f, 14f)
                horizontalLineTo(14.316f)
                curveTo(14.94f, 14f, 15.252f, 14f, 15.551f, 13.939f)
                curveTo(15.816f, 13.884f, 16.072f, 13.795f, 16.313f, 13.672f)
                curveTo(16.584f, 13.533f, 16.827f, 13.338f, 17.315f, 12.948f)
                lineTo(20.972f, 10.022f)
                moveTo(3.027f, 10.022f)
                curveTo(3f, 10.49f, 3f, 11.064f, 3f, 11.8f)
                verticalLineTo(16.2f)
                curveTo(3f, 17.88f, 3f, 18.72f, 3.327f, 19.362f)
                curveTo(3.615f, 19.927f, 4.074f, 20.385f, 4.638f, 20.673f)
                curveTo(5.28f, 21f, 6.12f, 21f, 7.8f, 21f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 21f, 18.72f, 21f, 19.362f, 20.673f)
                curveTo(19.927f, 20.385f, 20.385f, 19.927f, 20.673f, 19.362f)
                curveTo(21f, 18.72f, 21f, 17.88f, 21f, 16.2f)
                verticalLineTo(11.8f)
                curveTo(21f, 11.064f, 21f, 10.49f, 20.972f, 10.022f)
                moveTo(3.027f, 10.022f)
                curveTo(3.063f, 9.422f, 3.143f, 8.999f, 3.327f, 8.638f)
                curveTo(3.615f, 8.074f, 4.074f, 7.615f, 4.638f, 7.327f)
                curveTo(5.28f, 7f, 6.12f, 7f, 7.8f, 7f)
                horizontalLineTo(8f)
                moveTo(20.972f, 10.022f)
                curveTo(20.937f, 9.422f, 20.857f, 8.999f, 20.673f, 8.638f)
                curveTo(20.385f, 8.074f, 19.927f, 7.615f, 19.362f, 7.327f)
                curveTo(18.72f, 7f, 17.88f, 7f, 16.2f, 7f)
                horizontalLineTo(16f)
                moveTo(8f, 7f)
                verticalLineTo(6f)
                curveTo(8f, 4.343f, 9.343f, 3f, 11f, 3f)
                horizontalLineTo(13f)
                curveTo(14.657f, 3f, 16f, 4.343f, 16f, 6f)
                verticalLineTo(7f)
                moveTo(8f, 7f)
                horizontalLineTo(16f)
            }
        }.build()

        return _Briefcase!!
    }

@Suppress("ObjectPropertyName")
private var _Briefcase: ImageVector? = null
