package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WandMagicSparkles: ImageVector
    get() {
        if (_WandMagicSparkles != null) {
            return _WandMagicSparkles!!
        }
        _WandMagicSparkles = ImageVector.Builder(
            name = "WandMagicSparkles",
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
                moveTo(5f, 7f)
                verticalLineTo(11f)
                moveTo(10f, 2f)
                verticalLineTo(6f)
                moveTo(18f, 16f)
                verticalLineTo(20f)
                moveTo(3f, 9f)
                horizontalLineTo(7f)
                moveTo(8f, 4f)
                horizontalLineTo(12f)
                moveTo(16f, 18f)
                horizontalLineTo(20f)
                moveTo(14f, 7f)
                lineTo(16.828f, 9.828f)
                moveTo(19.516f, 3.746f)
                lineTo(20.082f, 4.312f)
                curveTo(20.478f, 4.708f, 20.676f, 4.906f, 20.75f, 5.134f)
                curveTo(20.815f, 5.335f, 20.815f, 5.551f, 20.75f, 5.752f)
                curveTo(20.676f, 5.981f, 20.478f, 6.179f, 20.082f, 6.575f)
                lineTo(6.525f, 20.131f)
                curveTo(6.129f, 20.527f, 5.931f, 20.725f, 5.703f, 20.8f)
                curveTo(5.502f, 20.865f, 5.286f, 20.865f, 5.085f, 20.8f)
                curveTo(4.856f, 20.725f, 4.658f, 20.527f, 4.262f, 20.131f)
                lineTo(3.697f, 19.566f)
                curveTo(3.301f, 19.17f, 3.103f, 18.972f, 3.028f, 18.743f)
                curveTo(2.963f, 18.542f, 2.963f, 18.326f, 3.028f, 18.125f)
                curveTo(3.103f, 17.897f, 3.301f, 17.699f, 3.697f, 17.303f)
                lineTo(17.253f, 3.746f)
                curveTo(17.649f, 3.35f, 17.847f, 3.152f, 18.076f, 3.078f)
                curveTo(18.277f, 3.013f, 18.493f, 3.013f, 18.694f, 3.078f)
                curveTo(18.922f, 3.152f, 19.12f, 3.35f, 19.516f, 3.746f)
                close()
            }
        }.build()

        return _WandMagicSparkles!!
    }

@Suppress("ObjectPropertyName")
private var _WandMagicSparkles: ImageVector? = null
