package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BriefcaseAlt4: ImageVector
    get() {
        if (_BriefcaseAlt4 != null) {
            return _BriefcaseAlt4!!
        }
        _BriefcaseAlt4 = ImageVector.Builder(
            name = "BriefcaseAlt4",
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
                moveTo(3f, 12f)
                horizontalLineTo(21f)
                moveTo(7f, 12f)
                verticalLineTo(14f)
                moveTo(17f, 12f)
                verticalLineTo(14f)
                moveTo(8f, 7f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 7f, 5.28f, 7f, 4.638f, 7.327f)
                curveTo(4.074f, 7.615f, 3.615f, 8.074f, 3.327f, 8.638f)
                curveTo(3f, 9.28f, 3f, 10.12f, 3f, 11.8f)
                verticalLineTo(16.2f)
                curveTo(3f, 17.88f, 3f, 18.72f, 3.327f, 19.362f)
                curveTo(3.615f, 19.927f, 4.074f, 20.385f, 4.638f, 20.673f)
                curveTo(5.28f, 21f, 6.12f, 21f, 7.8f, 21f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 21f, 18.72f, 21f, 19.362f, 20.673f)
                curveTo(19.927f, 20.385f, 20.385f, 19.927f, 20.673f, 19.362f)
                curveTo(21f, 18.72f, 21f, 17.88f, 21f, 16.2f)
                verticalLineTo(11.8f)
                curveTo(21f, 10.12f, 21f, 9.28f, 20.673f, 8.638f)
                curveTo(20.385f, 8.074f, 19.927f, 7.615f, 19.362f, 7.327f)
                curveTo(18.72f, 7f, 17.88f, 7f, 16.2f, 7f)
                horizontalLineTo(16f)
                moveTo(8f, 7f)
                verticalLineTo(6f)
                curveTo(8f, 5.068f, 8f, 4.602f, 8.152f, 4.235f)
                curveTo(8.355f, 3.745f, 8.745f, 3.355f, 9.235f, 3.152f)
                curveTo(9.602f, 3f, 10.068f, 3f, 11f, 3f)
                horizontalLineTo(13f)
                curveTo(13.932f, 3f, 14.398f, 3f, 14.765f, 3.152f)
                curveTo(15.255f, 3.355f, 15.645f, 3.745f, 15.848f, 4.235f)
                curveTo(16f, 4.602f, 16f, 5.068f, 16f, 6f)
                verticalLineTo(7f)
                moveTo(8f, 7f)
                horizontalLineTo(16f)
            }
        }.build()

        return _BriefcaseAlt4!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseAlt4: ImageVector? = null
